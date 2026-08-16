
/*
 * CreateRunRequest_model.h
 *
 * The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
 */

#ifndef TINY_CPP_CLIENT_CreateRunRequest_model_H_
#define TINY_CPP_CLIENT_CreateRunRequest_model_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The ID of the [Model](/docs/api-reference/models) to be used to execute this run. If a value is provided here, it will override the model associated with the assistant. If not, the model associated with the assistant will be used.
 *
 *  \ingroup Models
 *
 */

class CreateRunRequest_model{
public:

    /*! \brief Constructor.
	 */
    CreateRunRequest_model();
    CreateRunRequest_model(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateRunRequest_model();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateRunRequest_model_H_ */
