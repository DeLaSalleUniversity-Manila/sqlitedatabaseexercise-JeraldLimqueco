package com.example.jerald.petdatabase;

/**
 * Created by Jerald on 10/20/2015.
 */
public class Dogs {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Dogs[] dogs = {
            new Dogs("Siberian Husky", "\nThe Siberian Husky is a medium size, dense-coat working dog breed that originated in north-eastern Siberia." +
                    "The breed belongs to the Spitz genetic family. Siberian Huskies were bred by the Chukchi of Northeastern Asia to pull heavy loads long distances through difficult conditions. " +
                    "The dogs were imported into Alaska during the Nome Gold Rush and later spread into the United States and Canada. " +
                    "They were initially sent to Alaska and Canada as sled dogs but rapidly acquired the status of family pets and show dogs."+
                    "\n\nDistinct Characteristic: It is recognizable by its thickly furred double coat, erect triangular ears, and distinctive markings."+
                    "\n\nColor: White, SaddleBack, Sable, Agouti, Light Red, Copper, Silver and white, Grey, wolf grey, black and white, black, pie-bald and splash coat"+
                    "\n\nTemperament: Huskies are a very active, energetic, and resilient breed whose ancestors came from the extremely cold and harsh environment of the Siberian Arctic. "
                   ,R.drawable.husky),

            new Dogs("Pomeranian", "\nThe Pomeranian  is a breed of dog of the Spitz type, named for the Pomerania region in Central Europe ."+
                    "\n\nSize: Classed as a toy dog breed because of its small size, they weighs around 1.9–3.5 kilograms (4.2–7.7 lb) and standing 5.0–11 inches (13–28 cm) high at the withers." +
                    "\n\nFur: They are compact but sturdy dogs with an abundant textured coat with a highly plumed tail set high and flat." +
                    "The top coat forms a ruff of fur on the neck, which Poms are well known for, and they also have a fringe of feathery hair on the hindquarters."+
                    "\n\nColors: white, black, brown, red, orange, cream, blue, sable, black and tan, brown and tan, spotted, brindle, plus combinations of those colors."+
                    "\n\nTemperament: Pomeranians are typically a very friendly, playful and lively breed of dog, but are often aggressive to other dogs. " +
                    "They love to be around their owners and are known to be protective of them.",
                    R.drawable.pomeranian),

            new Dogs("Chow Chow","\nThe Chow Chow or Chow is a dog breed originally from northern China, where it is now known as the \"Fluffy Lion-dog\""+
                    "\n\nThe breed has also been called the Tang Quan, \"Dog of the Tang Empire\". It is believed that the Chow Chow is one of the native dogs used as the model for the Foo Dog, the traditional stone guardians found in front of Buddhist temples and palaces."+
                    "\n\nThe Chow Chow is a sturdily built dog, square in profile, with a broad skull and small, triangular, erect ears with rounded tips. The breed is known for a very dense double coat that is either smooth or rough."+
                    "\n\nColor: red, black, blue, cinnamon/fawn, or cream"+
                    "\n\nTemperament: Chow Chows tend to display discernment of strangers and can become fiercely protective of their owners and property."
                    ,R.drawable.chow)
};

    private Dogs(String name, String description, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public String toString() {
        return this.name;
    }
}

