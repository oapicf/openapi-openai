
/*
 * FineTuneSupervisedMethod.h
 *
 * Configuration for the supervised fine-tuning method.
 */

#ifndef TINY_CPP_CLIENT_FineTuneSupervisedMethod_H_
#define TINY_CPP_CLIENT_FineTuneSupervisedMethod_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FineTuneSupervisedMethod_hyperparameters.h"

namespace Tiny {


/*! \brief Configuration for the supervised fine-tuning method.
 *
 *  \ingroup Models
 *
 */

class FineTuneSupervisedMethod{
public:

    /*! \brief Constructor.
	 */
    FineTuneSupervisedMethod();
    FineTuneSupervisedMethod(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~FineTuneSupervisedMethod();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	FineTuneSupervisedMethod_hyperparameters getHyperparameters();

	/*! \brief Set 
	 */
	void setHyperparameters(FineTuneSupervisedMethod_hyperparameters  hyperparameters);


    private:
    FineTuneSupervisedMethod_hyperparameters hyperparameters;
};
}

#endif /* TINY_CPP_CLIENT_FineTuneSupervisedMethod_H_ */
