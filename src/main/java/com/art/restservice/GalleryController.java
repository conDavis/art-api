package com.art.restservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


@RestController
public class GalleryController {

    /**
     *
     * @return random piece out of gallery pieces.
     */
    @ResponseBody
    @GetMapping( "/random")
    public ArtPiece artPiece() {
        Random rand = new Random();
        int upperbound = Gallery.pieces.length;
        //generate random values from 0-24
        int int_random = rand.nextInt(upperbound);
        return Gallery.pieces[int_random];
    }

    /**
     *
     * @return all gallery pieces.
     */
    @ResponseBody
    @GetMapping("/all")
    public ArtPiece[] allPieces() {
        return Gallery.pieces;
    }


}
