public class SuperArray{
  private String[] data;
  private int size;
  public SuperArray(){
    data = new String[10];
  }
  public SuperArray(int startingCapacity){
    if (startingCapacity < 0){
      throw new IllegalArgumentException();
    }
    size = startingCapacity;
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
    return size() == 0;
  }
  public boolean add(String element){
    if (size() == data.length){
      resize();
      data[size] = element;
      size++;
    }
    if (size() < data.length){
      data[size] = element;
      size++;
    }
    return true;
  }
  public String toString(){
    if (size() == 0){
      return "[]";
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
      throw new IndexOutOfBoundsException();
    }
    return data[index];
  }
  public String set(int index, String element){
    if (index < 0 || index >= size()){
      throw new IndexOutOfBoundsException();
    }
    String returnValue = data[index];
    data[index] = element;
    return returnValue;
  }
  private void resize(){
    String[] dataTemp = new String[size + 1];
      for (int i = 0; i < data.length; i++){
      dataTemp[i] = data[i];
     }
    data = dataTemp;
    }
  public boolean contains(String target){
    for (int i = 0; i < size(); i++){
      if (data[i].equals(target)){
        return true;
      }
  }
  return false;
  }
  public int indexOf(String target){
    for (int i = 0; i < size(); i++){
      if (data[i].equals(target)){
        return i;
      }
  }
  return -1;
}
  public int lastIndexOf(String target){
    for (int i = size() - 1; i != -1; i--){
      if (data[i].equals(target)){
        return i;
      }
      }
    return -1;
  }
  public void add(int index, String element){
    if (index < 0 || index > size()){
      throw new IndexOutOfBoundsException();
    }
    else if (index == size()){
      add(element);
    }
    else if (index < size()){
      add(element);
      String[] dataTemp = new String[size];
      dataTemp = data;
      for(int i = index + 1; i < size(); i++){
        dataTemp[i] = data[i - 1];
      }
      dataTemp[index] = element;
      data = dataTemp;
    }
  }
  public String remove(int index){
    String returnValue = "";
    if (index < 0 || index > size()){
      throw new IndexOutOfBoundsException();

    }
      else if (index < size()){
        returnValue = data[index];
        for (int i = index + 1; i < size(); i++){
          data[i - 1] = data[i];
        }
    size--;
  }
  return returnValue;
}
  public boolean remove(String element){
    for (int i = 0; i < size(); i++){
      if (data[i] == element){
        remove(i);
        return true;
      }
    }
    return false;
  }
}
