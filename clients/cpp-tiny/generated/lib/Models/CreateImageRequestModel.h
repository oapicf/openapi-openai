
/*
 * CreateImageRequest_model.h
 *
 * The model to use for image generation.
 */

#ifndef TINY_CPP_CLIENT_CreateImageRequest_model_H_
#define TINY_CPP_CLIENT_CreateImageRequest_model_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The model to use for image generation.
 *
 *  \ingroup Models
 *
 */

class CreateImageRequest_model{
public:

    /*! \brief Constructor.
	 */
    CreateImageRequest_model();
    CreateImageRequest_model(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateImageRequest_model();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateImageRequest_model_H_ */
