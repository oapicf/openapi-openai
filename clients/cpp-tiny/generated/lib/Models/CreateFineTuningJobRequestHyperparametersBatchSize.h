
/*
 * CreateFineTuningJobRequest_hyperparameters_batch_size.h
 *
 * Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
 */

#ifndef TINY_CPP_CLIENT_CreateFineTuningJobRequest_hyperparameters_batch_size_H_
#define TINY_CPP_CLIENT_CreateFineTuningJobRequest_hyperparameters_batch_size_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
 *
 *  \ingroup Models
 *
 */

class CreateFineTuningJobRequest_hyperparameters_batch_size{
public:

    /*! \brief Constructor.
	 */
    CreateFineTuningJobRequest_hyperparameters_batch_size();
    CreateFineTuningJobRequest_hyperparameters_batch_size(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CreateFineTuningJobRequest_hyperparameters_batch_size();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CreateFineTuningJobRequest_hyperparameters_batch_size_H_ */
