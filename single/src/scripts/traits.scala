trait T1 {
	println("in T1: x = " + x)
	val x =1;
	println("in T1: x = " + x)
}

trait T2 {
	println("in T2: y = " + y)
	val y ="T2";
	println("in T2: y = " + y)
}

class Base12 {
	println ("in Base: b = " + b)
	val b = "Base"
	println ("in Base: b = " + b)
}


class Hija extends Base12 with T1 with T2 {
	println ("in Hija c = " + c)
	val c = "Hija"
	println ("in Hija c = " + c)
}

println("Creando Hijo")
new Hija

println("Hijo credo")