
/*
 * CreateFineTuningJobRequest_model.h
 *
 * The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning#which-models-can-be-fine-tuned). 
 */

#ifndef TINY_CPP_CLIENT_CreateFineTuningJobRequest_model_H_
#define TINY_CPP_CLIENT_CreateFineTuningJobRequest_model_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning#which-models-can-be-fine-tuned). 
 *
 *  \ingroup Models
 *
 */

class CreateFineTuningJobRequest_model{
public:

    /*! \brief Constructor.
	 */
    CreateFineTuningJobRequest_model();
    CreateFineTuningJobRequest_model(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateFineTuningJobRequest_model();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateFineTuningJobRequest_model_H_ */
