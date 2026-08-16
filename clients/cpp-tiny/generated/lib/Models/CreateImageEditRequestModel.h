
/*
 * CreateImageEditRequest_model.h
 *
 * The model to use for image generation. Only &#x60;dall-e-2&#x60; is supported at this time.
 */

#ifndef TINY_CPP_CLIENT_CreateImageEditRequest_model_H_
#define TINY_CPP_CLIENT_CreateImageEditRequest_model_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The model to use for image generation. Only `dall-e-2` is supported at this time.
 *
 *  \ingroup Models
 *
 */

class CreateImageEditRequest_model{
public:

    /*! \brief Constructor.
	 */
    CreateImageEditRequest_model();
    CreateImageEditRequest_model(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateImageEditRequest_model();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateImageEditRequest_model_H_ */
