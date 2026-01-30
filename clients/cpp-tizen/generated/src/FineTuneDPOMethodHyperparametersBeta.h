/*
 * FineTuneDPOMethod_hyperparameters_beta.h
 *
 * The beta value for the DPO method. A higher beta value will increase the weight of the penalty between the policy and reference model. 
 */

#ifndef _FineTuneDPOMethod_hyperparameters_beta_H_
#define _FineTuneDPOMethod_hyperparameters_beta_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The beta value for the DPO method. A higher beta value will increase the weight of the penalty between the policy and reference model. 
 *
 *  \ingroup Models
 *
 */

class FineTuneDPOMethod_hyperparameters_beta : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuneDPOMethod_hyperparameters_beta();
	FineTuneDPOMethod_hyperparameters_beta(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuneDPOMethod_hyperparameters_beta();

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

#endif /* _FineTuneDPOMethod_hyperparameters_beta_H_ */
