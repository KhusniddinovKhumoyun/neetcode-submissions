class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
 val length = nums.size - 1

// lefts[i] = product of all elements to the LEFT of i
val lefts = IntArray(length + 1)

// right[i] = product of all elements to the RIGHT of i
val right = IntArray(length + 1)

// Final answer
val result = IntArray(length + 1)

// Running product from the left side
var leftMultiplies = 1

// Running product from the right side
var rightMultiplies = 1

for (i in 0..length) {

    // Store the product of all elements BEFORE index i
    lefts[i] = leftMultiplies

    // Store the product of all elements AFTER index i
    // We fill the array from right to left
    right[length - i] = rightMultiplies

    // Add nums[i] to the running left product
    leftMultiplies *= nums[i]

    // Add nums[length - i] to the running right product
    rightMultiplies *= nums[length - i]
}

for (i in 0..length) {

    // Product except nums[i] =
    // product on the left × product on the right
    result[i] = lefts[i] * right[i]
}

return result
    }
}
