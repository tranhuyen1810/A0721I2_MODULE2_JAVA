package bai_10_dsa_danh_sach.bai_tap;

import java.util.Arrays;

public class MyArrayList<E> {
    private int size = 0; //so luong phan tu co trong array list
    private static final int DEFAULT_CAPACITY = 10; //suc chua cua array list
    Object elements[]; //khai bao mang doi tuong chua phan tu

    public MyArrayList() {
        elements = new Object[DEFAULT_CAPACITY]; //suc chua mac dinh khi khoi tao bang constructor khong tham so
    }

    public MyArrayList(int capacity) {
        if (capacity >= 0) {
            elements = new Object[capacity]; //phuong thuc constructor voi suc chua duoc truyen vao
        } else {
            throw new IllegalArgumentException("capacity: " + capacity);
        }
    }

    //phuong thuc tra ve so luong phan tu (return)
    public int size() {
        return this.size;
    }

    //phuong thuc clear ArrayList
    public void clear() {
        size = 0;
        for (int i = 0; i < elements.length; i++) {
            elements[i] = null;
        }
    }

    //phuong thuc add 1 phan tu vao cuoi MyArrayList
    public boolean add(E element) {
        if (elements.length == size) {
            this.ensureCapacity(5);
        }
        elements[size] = element;
        size++;
        return true;
    }

    //phuong thuc tang kich thuoc cua MyArrayList
    public void ensureCapacity(int minCapacity) {
        if (minCapacity >= 0) {
            int newSize = this.elements.length + minCapacity;
            elements = Arrays.copyOf(elements, newSize);
        } else {
            throw new IllegalArgumentException("minCapacity: " + minCapacity);
        }
    }

    //add 1 phan tu vao vi tri bat ky trong MyArrayList
    public void add(E element, int index) {
        if (index > elements.length) {
            throw new IllegalArgumentException("index: " + index);
        } else if (elements.length == size) {
            this.ensureCapacity(5);
        }
        if (elements[index] == null) {
            elements[index] = element;
            size++;
        } else {
            for (int i = size + 1; i >= index; i--) {
                elements[i] = elements[i - 1];
            }
            elements[index] = element;
            size++;
        }
    }

    //phuong thuc lay index cua 1 phan tu
    public E get(int index) {
        checkIndex(index);
        return (E) elements[index];
    }

    private void checkIndex(int index){
        if(index<0||index>=size){
            throw new IllegalArgumentException("Error index: "+index);
        }
    }

    //phuong thuc lay index của 1 phan tu
    public int indexOf(E element) {
        int index = -1;
        for (int i=0;i<size;i++){
            if(this.elements[i].equals(element)){
                return i;
            }
        }
        return index;
    }

    //phuong thuc kiem tra 1 phan tu co ton tai trong mang khong
    public boolean contains(E element){
        return this.indexOf(element)>=0;
    }

    //phuong thuc tao ban sao cua ArrayList hien tai
    public MyArrayList<E>clone(){
        MyArrayList<E> v=new MyArrayList<>();
        v.elements=Arrays.copyOf(elements,size);
        v.size=this.size;
        return v;
    }

    //phuong thuc xoa 1 phan tu tai 1 vi tri index
    public E remove(int index){
        if(index<0||index>elements.length){
            throw new IllegalArgumentException("Error index: "+index);
        }
        E element=(E)elements[index];
        for(int i=index;i<size-1;i++){
            elements[i]=elements[i+1];
        }
        elements[size-1]=null;
        size--;
        return element;
    }
}