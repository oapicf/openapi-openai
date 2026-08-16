
/*
 * CreateSpeechRequest_model.h
 *
 * One of the available [TTS models](/docs/models#tts): &#x60;tts-1&#x60; or &#x60;tts-1-hd&#x60; 
 */

#ifndef TINY_CPP_CLIENT_CreateSpeechRequest_model_H_
#define TINY_CPP_CLIENT_CreateSpeechRequest_model_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief One of the available [TTS models](/docs/models#tts): `tts-1` or `tts-1-hd` 
 *
 *  \ingroup Models
 *
 */

class CreateSpeechRequest_model{
public:

    /*! \brief Constructor.
	 */
    CreateSpeechRequest_model();
    CreateSpeechRequest_model(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateSpeechRequest_model();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateSpeechRequest_model_H_ */
