package br.iantel;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class SoldGames {
    private int rank;
    private String name;
    private String platform;
    private int year;
    private String genre;
    private String publisher;
    private double na_sales;
    private double eu_sales;
    private double jp_sales;
    private double other_sales;
    private double global_sales;

}
