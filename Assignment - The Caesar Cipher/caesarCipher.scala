object caesarCipher extends App{

    val encrypt=(ch:Char, key:Int)=>if((ch.toUpper.toInt+key)<=90) (ch.toUpper.toInt+key).toChar else 65.toChar

    val decrypt=(ch:Char, key:Int)=>if((ch.toUpper.toInt-key)>=65 || (ch.toUpper.toInt-key)==32) (ch.toUpper.toInt-key).toChar else 90.toChar

    var cipher=(func:(Char,Int)=>Char,s:String, key:Int)=>s.map(func(_,key)) 

    val encrypted=cipher(encrypt,"Dinuka Jayalath",1)
    val decrypted=cipher(decrypt,encrypted,1)

    println(encrypted)
    println(decrypted)
}