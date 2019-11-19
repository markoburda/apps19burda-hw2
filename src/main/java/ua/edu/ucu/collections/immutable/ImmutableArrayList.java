//package ua.edu.ucu.collections.immutable;
//
//public final class ImmutableArrayList implements ImmutableList {
////    private Object[] arrayList;
//
//
////    public ImmutableArrayList() {
////        arrayList = new Object[0];
////    }
////
////    public ImmutableArrayList(Object[] c) {
////         arrayList = c.clone();
////    }
//
////    public ImmutableArrayList add(Object e) {
////        return add(arrayList.length, e);
////    }
//
////    public ImmutableArrayList add(int index, Object e) {
////        return addAll(index, new Object[]{e});
////    }
////
////    public ImmutableArrayList addAll(Object[] c) {
////        return addAll(arrayList.length, c);
////    }
//
////    public ImmutableArrayList addAll(int index, Object[] c) {
////        if (index < 0 || index > arrayList.length) {
////            throw new IndexOutOfBoundsException();
////        }
////        //TODO
////    }
//
//    public Object get(int index) {
//        return arrayList[index];
//    }
//
////    public ImmutableArrayList remove(int index) {
////        if (index < 0 || index >= arrayList.length) {
////            throw new IndexOutOfBoundsException();
////        }
////        //TODO
////    }
//
////    public ImmutableArrayList set(int index, Object e) {
////        Object[] newList = arrayList.clone();
////        newList[index] = e;
////        return new ImmutableArrayList(newList);
////    }
////
////    public int indexOf(Object e) {
////        for (int i = 0; i < arrayList.length; i++) {
////            if (arrayList[i].equals(e)) {
////                return i;
////            }
////        }
////        return -1;
////    }
////
////    public int size() {
////        return arrayList.length;
////    }
////
////    public ImmutableArrayList clear() {
////        return new ImmutableArrayList();
////    }
////
////    public boolean isEmpty() {
////        return arrayList.length == 0;
////    }
////
////    public Object[] toArray() {
////        return arrayList.clone();
////    }
//
////    @Override
////    public String toString() {
////        //TODO
////        String str = Arrays.toString(toArray());
////        return str.substring(1, str.length() - 1);
////    }
//}
