
/*
 * FineTuneDPOMethod.h
 *
 * Configuration for the DPO fine-tuning method.
 */

#ifndef TINY_CPP_CLIENT_FineTuneDPOMethod_H_
#define TINY_CPP_CLIENT_FineTuneDPOMethod_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FineTuneDPOMethod_hyperparameters.h"

namespace Tiny {


/*! \brief Configuration for the DPO fine-tuning method.
 *
 *  \ingroup Models
 *
 */

class FineTuneDPOMethod{
public:

    /*! \brief Constructor.
	 */
    FineTuneDPOMethod();
    FineTuneDPOMethod(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FineTuneDPOMethod();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	FineTuneDPOMethod_hyperparameters getHyperparameters();

	/*! \brief Set 
	 */
	void setHyperparameters(FineTuneDPOMethod_hyperparameters  hyperparameters);


    private:
    FineTuneDPOMethod_hyperparameters hyperparameters;
};
}

#endif /* TINY_CPP_CLIENT_FineTuneDPOMethod_H_ */
