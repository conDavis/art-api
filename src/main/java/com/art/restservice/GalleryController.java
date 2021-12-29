package com.art.restservice;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Random;


@RestController
public class GalleryController {

    /**
     *
     * @return random piece out of gallery pieces.
     */
    @CrossOrigin(origins = "http://localhost:3000")
    @ResponseBody
    @GetMapping( value = "/random", produces = "application/json")
    public ArtPiece artPiece() {
        Random rand = new Random();
        int upperbound = Gallery.pieces.length;
        //generate random values from 0-24
        int int_random = rand.nextInt(upperbound);
        return Gallery.pieces[int_random];
    }

    /**
     * Returns the piece with the given name or null if it does not exist.
     * @param name the name of the piece to find
     * @return the piece with the given name or null
     */
    @CrossOrigin(origins = "http://localhost:3000")
    @ResponseBody
    @GetMapping(value = "/piece", produces = "application/json")
    public ArtPiece piece(@RequestParam(value = "name", defaultValue = "self portrait 2020") String name) {
        ArtPiece piece;
        try {
            if (name.contains("\""))
                piece = Gallery.getPiece(name.substring(1, name.length() - 1));
            piece = Gallery.getPiece(name);
            return piece;
        } catch (Exception exc) {

            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, exc.getMessage(), exc);
        }

    }

    /**
     *
     * @return all gallery pieces.
     */
    @CrossOrigin(origins = "http://localhost:3000")
    @ResponseBody
    @GetMapping(value = "/all", produces = "application/json")
    public ArtPiece[] allPieces() {
        return Gallery.pieces;
    }


}
