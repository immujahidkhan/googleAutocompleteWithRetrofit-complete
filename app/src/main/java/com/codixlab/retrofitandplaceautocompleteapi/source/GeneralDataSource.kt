package com.codixlab.retrofitandplaceautocompleteapi.source

import com.codixlab.retrofitandplaceautocompleteapi.models.PlaceAutoCompleteResponse
import com.codixlab.retrofitandplaceautocompleteapi.models.PlaceDetailsResponse
import com.codixlab.retrofitandplaceautocompleteapi.utils.ResponseStatusCallbacks

/**
 * created by Mustufa Ansari on 18,August,2020
 * Email : mustufaayub82@gmail.com
 */
interface GeneralDataSource {

    suspend fun getAutocompletePlaces(
        input: String
    ): PlaceAutoCompleteResponse

    suspend fun getPlaceDetails(
        placeId: String
    ): PlaceDetailsResponse

}