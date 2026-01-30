/*
 * FineTuneDPOMethod.h
 *
 * Configuration for the DPO fine-tuning method.
 */

#ifndef _FineTuneDPOMethod_H_
#define _FineTuneDPOMethod_H_


#include <string>
#include "FineTuneDPOMethod_hyperparameters.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Configuration for the DPO fine-tuning method.
 *
 *  \ingroup Models
 *
 */

class FineTuneDPOMethod : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuneDPOMethod();
	FineTuneDPOMethod(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuneDPOMethod();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FineTuneDPOMethod_hyperparameters getHyperparameters();

	/*! \brief Set 
	 */
	void setHyperparameters(FineTuneDPOMethod_hyperparameters  hyperparameters);

private:
	FineTuneDPOMethod_hyperparameters hyperparameters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuneDPOMethod_H_ */
