Êþº¾   =   test4/Ques46  java/lang/Object <init> ()V Code
  	   LineNumberTable LocalVariableTable this Ltest4/Ques46; groupAnagrams %([Ljava/lang/String;)Ljava/util/List; 	Signature K([Ljava/lang/String;)Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>;  java/util/ArrayList
  	  java/util/HashMap
  	
    java/lang/String   toCharArray ()[C
  !   java/util/Arrays " # sort ([C)V
  % & ' valueOf ([C)Ljava/lang/String;
  ) * + get &(Ljava/lang/Object;)Ljava/lang/Object; - java/util/List , / 0 1 add (Ljava/lang/Object;)Z
  3 4 5 put 8(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
  7 8 9 entrySet ()Ljava/util/Set; ; = < java/util/Set > ? iterator ()Ljava/util/Iterator; A C B java/util/Iterator D E next ()Ljava/lang/Object; G java/util/Map$Entry F I J E getValue A L M N hasNext ()Z strs [Ljava/lang/String; output Ljava/util/List; map Ljava/util/HashMap; i I str [C s Ljava/lang/String; a en Ljava/util/Map$Entry; LocalVariableTypeTable 6Ljava/util/List<Ljava/util/List<Ljava/lang/String;>;>; KLjava/util/HashMap<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>; $Ljava/util/List<Ljava/lang/String;>; MLjava/util/Map$Entry<Ljava/lang/String;Ljava/util/List<Ljava/lang/String;>;>; StackMapTable X P main ([Ljava/lang/String;)V i eat k tea m tan o ate q nat s bat
  u  	 w y x java/lang/System z { out Ljava/io/PrintStream; } Grouped anagrams: 
    java/io/PrintStream   println (Ljava/lang/String;)V  ------------------
     (Ljava/lang/Object;)V args words 
SourceFile Ques46.java InnerClasses  java/util/Map Entry !               /     *· ±    
       	             	           ß     ¯» Y· L» Y· M>§ b*2¶ :¸ ¸ $:,¶ (Æ %,¶ (À ,:*2¹ . W,¶ 2W§  » Y· :*2¹ . W,¶ 2W*¾¡ÿ,¶ 6¹ : :§ ¹ @ À FN+-¹ H À ,¹ . W¹ K ÿÞ+°    
   N             "  )  2  =  H  Q  T  ]  h  q  z #  $ £ # ­ &    \ 	   ¯ O P    § Q R    S T   h U V   T W X  ) H Y Z  =  [ R  ]  [ R    \ ]  ^   4   § Q _    S `  =  [ a  ]  [ a    \ b  c   . þ  , ý > d ù ÿ   e ,   A   	 f g     ¥     A½ YhSYjSYlSYnSYpSYrSL+¸ tM² v|¶ ~² v¶ ~² v,¶ ±    
       + $ , ) - 1 . 9 / @ 0         A  P   $   P  )  Q R  ^     )  Q _           
  F  	