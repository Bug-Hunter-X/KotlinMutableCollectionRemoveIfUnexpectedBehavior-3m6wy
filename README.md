# Kotlin Mutable Collection removeIf() Unexpected Behavior

This example demonstrates an uncommon but potential issue when using the `removeIf()` function on mutable lists or maps in Kotlin.  If the predicate used in `removeIf()` modifies the collection being iterated, the iteration process can be disrupted, leading to unexpected results.  The solution explores safer alternatives for removing elements based on a condition.

## Bug
The `removeIf` function works correctly on its own, but the problem is apparent when applied to a collection and simultaneously modifying it during the iteration.