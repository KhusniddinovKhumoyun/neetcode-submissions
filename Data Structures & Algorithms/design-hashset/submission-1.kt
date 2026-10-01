class MyHashSet() {
     val list = BooleanArray(1000001)
    fun add(key: Int) {
       list[key] = true
    }

    fun remove(key: Int) {
      list[key] = false
    }

    fun contains(key: Int): Boolean {
        return list[key]
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * var obj = MyHashSet()
 * obj.add(key)
 * obj.remove(key)
 * var param_3 = obj.contains(key)
 */
