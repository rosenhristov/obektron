package com.obectron.common.utils;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.DateFormat;

public interface Constants {

    // === INSTANCES ===
    DateFormat DATE_FORMAT_INSTANCE = DateFormat.getInstance();
    ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    //=== PATTERNS ===
    String DATE_FORMAT = "yyyy-MM-dd HH:mm:ss";
    String PHONE_NUMBER_PATTERN = "^(\\+|00)?(\\d){1,3}(\\s|-|/)?((\\s|-)?\\d{1,4}){1,4}$";
    String EMAIL_PATTERN = "^[\\w\\d._%+-]+@[\\w\\d.-]+\\.[\\w]{2,}$";
    String PASSWORD_PATTERN = "^[\\w\\d_\\-./?\\\\:!@#\\$%|\\^*]{8,32}";

    //=== ERRORS ===
    String INVALID_EMAIL_ADDRESS = "Invalid email address";
    String INVALID_PHONE_NUMBER = "Invalid phone number";
    String INVALID_PASSWORD_FORMAT = "Invalid password format";

    // === TABLES ===
    String USERS_TABLE = "users";
    String PEOPLE_TABLE = "people";
    String ADDRESSES_TABLE = "addresses";

    // === COLUMNS ===
    String ADDRESSES_COLUMN = "addresses";

    String BIRTHDATE_COLUMN = "birthdate";
    String BLOCK_COLUMN = "block";
    String COUNTRY_COLUMN = "country";
    String CITY_COLUMN = "city";
    String EMAIL_COLUMN = "email";
    String GENDER_COLUMN = "gender";
    String ID_COLUMN = "id";
    String FLAT_COLUMN = "flat";
    String FLOOR_COLUMN = "floor";
    String MAIDEN_NAME_COLUMN = "maiden_name";
    String NAME_COLUMN = "name";
    String NICKNAMES_COLUMN = "nicknames";
    String PATRONYM_COLUMN = "patronym";
    String PASSWORD_COLUMN = "password";
    String PHONE_COLUMN = "phone";
    String SURNAME_COLUMN = "surname";
    String QUARTER_COLUMN = "quarter";
    String ROLE_COLUMN = "role";
    String STREET_COLUMN = "street";
    String STREET_NUMBER_COLUMN = "street_number";
    String TYPE_COLUMN = "type";
    String USERNAME_COLUMN = "username";
    String ZIP_COLUMN = "zip";


    // === SYMBOLS ===
    String EMPTY_STRING = "";
    String SPACE = " ";
    String COMMA = ",";
    String UNDERSCORE = "_";
    String DASH = "-";
    String COLON = ":";
    String SEMICOLON = ";";
    String DOT = ".";
    String NEW_LINE = "\n";
    String NEW_LINE_WITH_TAB = "\n\t";
    String TAB = "\t";
    String SLASH = "/";
    String BACK_SLASH = "\\";
    String PIPE = "|";
    String QUESTION_MARK = "?";
    String ASTERISK = "*";
    String PERCENT = "%";
    String AMPERSAND = "&";
    String AT = "@";
    String EQUALS = "=";
    String OPEN_BRACKET = "(";
    String CLOSE_BRACKET = ")";
    String OPEN_CURLY_BRACKET = "{";
    String CLOSE_CURLY_BRACKET = "}";
    String OPEN_SQUARE_BRACKET = "[";
    String CLOSE_SQUARE_BRACKET = "]";
    String DOUBLE_QUOTE = "\"";
    String SINGLE_QUOTE = "'";
    String BACKTICK = "`";
    String HASH = "#";
    String DOLLAR = "$";
    String PERCENTAGE = "%";
    String CARET = "^";
    String TILDE = "~";

}
