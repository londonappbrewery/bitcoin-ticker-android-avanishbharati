package com.londonappbrewery.bitcointicker;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by Avanish Bharati on 09/29/17.
 */

public class BitcoinDataModel {

    private String mAskRate;
    private String mBitRate;
    private String mLastRate;

    public static BitcoinDataModel fromJson(JSONObject jsonObject){

        BitcoinDataModel BitCoinData = new BitcoinDataModel();

        try {
            BitCoinData.mAskRate  = jsonObject.getString("ask");
            BitCoinData.mBitRate  = jsonObject.getString("bid");
            BitCoinData.mLastRate = jsonObject.getString("last");


            return BitCoinData;

        }catch (JSONException e) {
            e.printStackTrace();
            return null;
        }

     }

    public String getAskRate() {
        return mAskRate;
    }

    public String getBitRate() {
        return mBitRate;
    }

    public String getLastRate() {
        return mLastRate;
    }
}
