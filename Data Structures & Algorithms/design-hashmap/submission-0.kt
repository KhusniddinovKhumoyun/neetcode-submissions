class MyHashMap() {

    private val keys = BooleanArray(1000001)
    private val values = IntArray(1000001)
    fun put(key: Int, value: Int) {
        keys[key] = true
        values[key] = value
    }

    fun get(key: Int): Int {
        return if (keys[key]) values[key]
        else -1
    }

    fun remove(key: Int) {
        keys[key] = false
        values[key] = -1
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * var obj = MyHashMap()
 * obj.put(key,value)
 * var param_2 = obj.get(key)
 * obj.remove(key)
 */
