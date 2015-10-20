package com.example.jerald.petdatabase;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class PetDatabaseHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "pet"; // the name of our database
    private static final int DB_VERSION = 2; // the version of the database

    PetDatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        updateMyDatabase(db, 0, DB_VERSION);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        updateMyDatabase(db, oldVersion, newVersion);
    }

    private void updateMyDatabase(SQLiteDatabase db, int oldVersion, int newVersion) {
        if (oldVersion < 1) {
            db.execSQL("CREATE TABLE DOG (_id INTEGER PRIMARY KEY AUTOINCREMENT, "
                    + "NAME TEXT, "
                    + "DESCRIPTION TEXT, "
                    + "IMAGE_RESOURCE_ID INTEGER);");
            insertDrink(db, "Siberian Husky", "\nThe Siberian Husky is a medium size, dense-coat working dog breed that originated in north-eastern Siberia." + "The breed belongs to the Spitz genetic family.It is recognizable by its thickly furred double coat, erect triangular ears, and distinctive markings." +
                    "\n\nHuskies are a very active, energetic, and resilient breed whose ancestors came from the extremely cold and harsh environment of the Siberian Arctic.\n" +
                    "Siberian Huskies were bred by the Chukchi of Northeastern Asia to pull heavy loads long distances through difficult conditions. \n" +
                    "The dogs were imported into Alaska during the Nome Gold Rush and later spread into the United States and Canada.\n" +
                    "They were initially sent to Alaska and Canada as sled dogs but rapidly acquired the status of family pets and show dogs.", R.drawable.husky);

            insertDrink(db, "Pomeranian", "\nThe Pomeranian  is a breed of dog of the Spitz type, named for the Pomerania region in Central Europe ."+
                    "Classed as a toy dog breed because of its small size, they weighs around 1.9–3.5 kilograms (4.2–7.7 lb) and standing 5.0–11 inches (13–28 cm) high at the withers." +
                    "They are compact but sturdy dogs with an abundant textured coat with a highly plumed tail set high and flat." +
                    "The top coat forms a ruff of fur on the neck, which Poms are well known for, and they also have a fringe of feathery hair on the hindquarters."+
                    "\n\nColors: white, black, brown, red, orange, cream, blue, sable, black and tan, brown and tan, spotted, brindle, plus combinations of those colors."+
                    "\n\nPomeranians are typically a very friendly, playful and lively breed of dog, but are often aggressive to other dogs. " +
                    "They love to be around their owners and are known to be protective of them.", R.drawable.pomeranian);
        }
        insertDrink(db, "Chow Chow", "\nThe Chow Chow or Chow is a dog breed originally from northern China, where it is now known as the \"Fluffy Lion-dog\""+
                "\n\nThe breed has also been called the Tang Quan, \"Dog of the Tang Empire\". It is believed that the Chow Chow is one of the native dogs used as the model for the Foo Dog, the traditional stone guardians found in front of Buddhist temples and palaces."+
                "\n\nThe Chow Chow is a sturdily built dog, square in profile, with a broad skull and small, triangular, erect ears with rounded tips. The breed is known for a very dense double coat that is either smooth or rough."+
                "\n\nColor: red, black, blue, cinnamon/fawn, or cream"+
                "\n\nTemperament: Chow Chows tend to display discernment of strangers and can become fiercely protective of their owners and property.", R.drawable.chow);

        if (oldVersion < 2) {
            db.execSQL("ALTER TABLE DRINK ADD COLUMN FAVORITE NUMERIC;");
        }
    }

    private static void insertDrink(SQLiteDatabase db, String name,
                                    String description, int resourceId) {
        ContentValues dogValues = new ContentValues();
        dogValues.put("NAME", name);
        dogValues.put("DESCRIPTION", description);
        dogValues.put("IMAGE_RESOURCE_ID", resourceId);
        db.insert("DOG", null, dogValues);
    }
}

