
/*
 * CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier.h
 *
 * Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
 */

#ifndef TINY_CPP_CLIENT_CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier_H_
#define TINY_CPP_CLIENT_CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
 *
 *  \ingroup Models
 *
 */

class CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier{
public:

    /*! \brief Constructor.
	 */
    CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier();
    CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateFineTuningJobRequest_hyperparameters_learning_rate_multiplier_H_ */
