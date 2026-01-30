/*
 * FineTuneDPOMethod_hyperparameters_learning_rate_multiplier.h
 *
 * Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
 */

#ifndef _FineTuneDPOMethod_hyperparameters_learning_rate_multiplier_H_
#define _FineTuneDPOMethod_hyperparameters_learning_rate_multiplier_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Scaling factor for the learning rate. A smaller learning rate may be useful to avoid overfitting. 
 *
 *  \ingroup Models
 *
 */

class FineTuneDPOMethod_hyperparameters_learning_rate_multiplier : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuneDPOMethod_hyperparameters_learning_rate_multiplier();
	FineTuneDPOMethod_hyperparameters_learning_rate_multiplier(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuneDPOMethod_hyperparameters_learning_rate_multiplier();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuneDPOMethod_hyperparameters_learning_rate_multiplier_H_ */
