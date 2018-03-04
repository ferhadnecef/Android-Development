package com.cityzen.cityzen.Utils.MapUtils.PoiCategoryFilter;

import java.util.ArrayList;

/**
 * Created by Valdio Veliu on 29/04/2017.
 */

public class FilterCategory {

    /**
     * category_accomodation
     * category_atm
     * category_bar
     * category_cafe
     * category_fast_food
     * category_gas_station
     * category_market
     * category_mobile_phone_store
     * category_parking
     * category_pharmacy
     * category_rental_bike
     * category_rental_car
     * category_restaurant
     * category_shopping_mall
     * category_tourism
     * category_transportation
     */
    public static ArrayList<OsmTag> getFilters(int poiId) {
        ArrayList<OsmTag> tags = new ArrayList<>();
        switch (poiId) {
            case 0:
                tags.add(new OsmTag("building", "hotel"));
                tags.add(new OsmTag("tourism", "hotel"));
                tags.add(new OsmTag("tourism", "apartment"));
                tags.add(new OsmTag("tourism", "hostel"));
                tags.add(new OsmTag("tourism", "motel"));
                tags.add(new OsmTag("tourism", "guest_house"));
                break;
            case 1:
                tags.add(new OsmTag("amenity", "atm"));
                tags.add(new OsmTag("amenity", "bank"));
                tags.add(new OsmTag("amenity", "bureau_de_change"));
                break;
            case 2:
                tags.add(new OsmTag("amenity", "bar"));
                tags.add(new OsmTag("amenity", "nightclub"));
                tags.add(new OsmTag("amenity", "pub"));
                break;
            case 3:
                tags.add(new OsmTag("amenity", "cafe"));
                tags.add(new OsmTag("shop", "coffee"));
                break;
            case 4:
                tags.add(new OsmTag("amenity", "fast_food"));
                break;
            case 5:
                tags.add(new OsmTag("amenity", "fuel"));
                tags.add(new OsmTag("shop", "fuel"));
                break;
            case 6:
                tags.add(new OsmTag("amenity", "marketplace"));
                tags.add(new OsmTag("building", "retail"));
                tags.add(new OsmTag("building", "kiosks"));
                tags.add(new OsmTag("shop", "convenience"));
                tags.add(new OsmTag("shop", "kiosks"));
                tags.add(new OsmTag("shop", "supermarket"));
                tags.add(new OsmTag("shop", "general"));
                tags.add(new OsmTag("shop", "variety_store"));
                tags.add(new OsmTag("shop", "tabacco"));
                break;
            case 7:
                tags.add(new OsmTag("shop", "mobile_phone"));
                break;
            case 8:
                tags.add(new OsmTag("amenity", "parking"));
                tags.add(new OsmTag("amenity", "parking_space"));
                tags.add(new OsmTag("building", "parking"));
                break;
            case 9:
                tags.add(new OsmTag("amenity", "clinic"));
                tags.add(new OsmTag("amenity", "doctors"));
                tags.add(new OsmTag("amenity", "dentist"));
                tags.add(new OsmTag("amenity", "pharmacy"));
                tags.add(new OsmTag("amenity", "hospital"));
                tags.add(new OsmTag("shop", "herbalist"));
                tags.add(new OsmTag("healthcare", "alternative"));
                break;
            case 10:
                tags.add(new OsmTag("amenity", "bicycle_rental"));
                break;
            case 11:
                tags.add(new OsmTag("amenity", "car_rental"));
                tags.add(new OsmTag("amenity", "car_sharing"));
                break;
            case 12:
                tags.add(new OsmTag("amenity", "restaurant"));
                tags.add(new OsmTag("amenity", "food_court"));
                break;
            case 13:
                tags.add(new OsmTag("shop", "department_store"));
                tags.add(new OsmTag("shop", "mall"));
                break;
            case 14:
                tags.add(new OsmTag("tourism", "museum"));
                tags.add(new OsmTag("tourism", "information"));
                tags.add(new OsmTag("tourism", "attraction"));
                tags.add(new OsmTag("tourism", "yes"));
                tags.add(new OsmTag("historic", "monument"));
                tags.add(new OsmTag("tourism", "zoo"));
                break;
            case 15:
                tags.add(new OsmTag("amenity", "taxi"));
                tags.add(new OsmTag("amenity", "bus_station"));
                tags.add(new OsmTag("railway", "station"));
                tags.add(new OsmTag("highway", "bus_stop"));
                tags.add(new OsmTag("railway", "tram_stop"));
                tags.add(new OsmTag("public_transport", "station"));
                tags.add(new OsmTag("railway", "subway_entrance"));
                break;
            default:
                break;
        }
        return tags;
    }
}
