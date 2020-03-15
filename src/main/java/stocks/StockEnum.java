package stocks;

import java.util.Date;

public enum StockEnum {

    //STOCK INFO FOR 2008-12-31

    MICROSOFT("MSFT", 19.87, 21.25, 18.47, 19.44, 1546943400),
    APPLE("AAPL", 91.30, 103.60, 84.55, 85.35, 721923100),
    VISA("V", 51.00, 57.67, 47.53, 52.45, 141021400),
    JPMORGANCHASE("JPM", 30.67, 37.70, 24.61, 31.53, 1154247300),
    JOHNSONJOHNSON("JNJ", 57.66, 60.25, 54.95, 59.83, 315194900),
    COCACOLA("COKE", 42.65, 46.00, 38.51, 45.96, 425300),
    CHEVRON("CVX", 76.50, 81.92, 68.22, 73.97, 392060500),
    BRITISHPETROLEUM("BP", 45.96, 50.10, 41.54, 46.74, 149495200),
    EXXON("XOM", 77.89, 83.64, 72.68, 79.83, 996412900);

    //AAPL,V,JNJ,COKE,CVX,BP,XOM,JPM,MSFT
    private final String symbol;
    private final Double open;
    private final Double high;
    private final Double low;
    private final Double close;
    private final Integer volume;

    StockEnum(String symbol, Double open, Double high, Double low, Double close, Integer volume) {
        this.symbol = symbol;
        this.open = open;
        this.high = high;
        this.low = low;
        this.close = close;
        this.volume = volume;
    }

    public String getSymbol() {
        return symbol;
    }

    public Double getOpen() {
        return open;
    }

    public Double getHigh() {
        return high;
    }

    public Double getLow() {
        return low;
    }

    public Double getClose() {
        return close;
    }

    public Integer getVolume() {
        return volume;
    }
}
