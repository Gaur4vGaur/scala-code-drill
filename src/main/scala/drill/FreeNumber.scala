package drill

/**
 * Find the smallest missing number
 *
 * @author: Gaurav Gaur
 **/
object FreeNumber {
	
	val sampleInput: Array[Int] = Array(8,23,9,0,12,11,1,10,13,7,41,4,14,21,5,17,3,19,2,6)

	def main(args: Array[String]): Unit = {
		val in = if(args.isEmpty) sampleInput else args.map(_.toInt)
		val array = Array.fill(in.length + 1)(false)

		in.foreach{i => if(i < array.length) array(i) = true}

		val out = array.zipWithIndex.find(x => !x._1) match {
			case Some(tup) => tup._2
			case None => array.length
		}

		println("missing number is " + out)
	}
}