val dangerousList: List<String?> = listOf(
        "hello",
        null,
        "goodbye"
)

val safeList: List<String> = dangerousList.filterNotNull()
println(safeList)