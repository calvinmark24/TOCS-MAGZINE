kotlin
suspend fun fetchData(): String {
// Simulate a network call
return withContext(Dispatchers.IO) {
// Perform network operation
"Data fetched"
}
}