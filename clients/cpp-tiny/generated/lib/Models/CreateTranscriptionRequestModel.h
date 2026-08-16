
/*
 * CreateTranscriptionRequest_model.h
 *
 * ID of the model to use. Only &#x60;whisper-1&#x60; (which is powered by our open source Whisper V2 model) is currently available. 
 */

#ifndef TINY_CPP_CLIENT_CreateTranscriptionRequest_model_H_
#define TINY_CPP_CLIENT_CreateTranscriptionRequest_model_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief ID of the model to use. Only `whisper-1` (which is powered by our open source Whisper V2 model) is currently available. 
 *
 *  \ingroup Models
 *
 */

class CreateTranscriptionRequest_model{
public:

    /*! \brief Constructor.
	 */
    CreateTranscriptionRequest_model();
    CreateTranscriptionRequest_model(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateTranscriptionRequest_model();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateTranscriptionRequest_model_H_ */
