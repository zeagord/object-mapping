package objectmappings.mapper;

import io.saisuryak.lab.objectmappings.model.domainobject.AddressDO;

import static java.util.Optional.ofNullable;

public class AddressMapper {

    public static String mapAddressDOToAddressDTO(AddressDO addressDO) {
        return String.format("%s %s %s %s %s %s",
                ofNullable(addressDO.getHouseNumber()),
                ofNullable(addressDO.getAddressLine1()).orElse(""),
                ofNullable(addressDO.getAddressLine2()).orElse(""),
                ofNullable(addressDO.getState()).orElse(""),
                ofNullable(addressDO.getCountry()).orElse(""),
                ofNullable(addressDO.getZipCode()).orElse(""));
    }
}
