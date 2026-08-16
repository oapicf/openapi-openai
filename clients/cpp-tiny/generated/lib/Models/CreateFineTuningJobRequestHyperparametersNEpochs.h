
/*
 * CreateFineTuningJobRequest_hyperparameters_n_epochs.h
 *
 * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
 */

#ifndef TINY_CPP_CLIENT_CreateFineTuningJobRequest_hyperparameters_n_epochs_H_
#define TINY_CPP_CLIENT_CreateFineTuningJobRequest_hyperparameters_n_epochs_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
 *
 *  \ingroup Models
 *
 */

class CreateFineTuningJobRequest_hyperparameters_n_epochs{
public:

    /*! \brief Constructor.
	 */
    CreateFineTuningJobRequest_hyperparameters_n_epochs();
    CreateFineTuningJobRequest_hyperparameters_n_epochs(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateFineTuningJobRequest_hyperparameters_n_epochs();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateFineTuningJobRequest_hyperparameters_n_epochs_H_ */
