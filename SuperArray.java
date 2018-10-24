public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
  }
  public void clear(){
    size = 0;
    data = new String[10];
  }
  public int size(){
    return size;
  }
  public boolean isEmpty(){
    return size == 0;
  }
  public boolean add(String element){
    if (size < data.length){
      data[size] = element;
      size++;
    }
    return true;
  }
  public String toString(){
    if (size == 0){
      return null;
    }
    String toStringTemp = "[";
    for (int i = 0; i < size - 1; i++){
      toStringTemp = toStringTemp + data[i] + ", ";
    }
    toStringTemp = toStringTemp + data[size - 1] + "]";
    return toStringTemp;
  }
  public String toStringDebug(){
    String toStringTemp = "[";
    for (int i = 0; i < data.length - 1; i++){
      toStringTemp = toStringTemp + data[i] + ", ";
    }
    toStringTemp = toStringTemp + data[data.length - 1] + "]";
    return toStringTemp;
  }
  public String get(int index){
    if (index < 0 || index >= size()){
      return null;
    }
    return data[index];
  }
  public String set(int index, String element){
    if (index < 0 || index >= size()){
      return null;
    }
    String returnValue = data[index];
    data[index] = element;
    return returnValue;
  }


  // public boolean booleanAdd(String element){
  //   if (data[size-1] != null){
  //     String[] dataTemp = new String[size + 1];
  //     for (int i = 0; i < data.length(); i++){
  //       dataTemp[i] = data[i];
  //     }
  //     dataTemp[size] = element;
  //     size++;
  //     data = dataTemp;
  //     }
  //   return true;
  //   }

  }
