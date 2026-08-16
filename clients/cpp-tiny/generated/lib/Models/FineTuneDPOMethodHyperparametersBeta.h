
/*
 * FineTuneDPOMethod_hyperparameters_beta.h
 *
 * The beta value for the DPO method. A higher beta value will increase the weight of the penalty between the policy and reference model. 
 */

#ifndef TINY_CPP_CLIENT_FineTuneDPOMethod_hyperparameters_beta_H_
#define TINY_CPP_CLIENT_FineTuneDPOMethod_hyperparameters_beta_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief The beta value for the DPO method. A higher beta value will increase the weight of the penalty between the policy and reference model. 
 *
 *  \ingroup Models
 *
 */

class FineTuneDPOMethod_hyperparameters_beta{
public:

    /*! \brief Constructor.
	 */
    FineTuneDPOMethod_hyperparameters_beta();
    FineTuneDPOMethod_hyperparameters_beta(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FineTuneDPOMethod_hyperparameters_beta();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_FineTuneDPOMethod_hyperparameters_beta_H_ */
