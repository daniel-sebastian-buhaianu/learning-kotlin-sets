// A set is a collection that does not have a specific order and does not allow duplicate values.

val solarSystem = mutableSetOf("Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune")

println(solarSystem.size)

solarSystem.add("Pluto")
println(solarSystem.size)

println(solarSystem.contains("Pluto"))

solarSystem.add("Pluto")
println(solarSystem.size)

solarSystem.remove("Pluto")
println(solarSystem.size)
println(solarSystem.contains("Pluto"))

