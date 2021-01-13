class ChecksumAccumulator {
  var sum = 0
  def add(b: Int): Unit = sum += b
  def checksum(): Int = ~(sum & 0xFF) + 1
}