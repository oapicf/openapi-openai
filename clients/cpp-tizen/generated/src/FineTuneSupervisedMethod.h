/*
 * FineTuneSupervisedMethod.h
 *
 * Configuration for the supervised fine-tuning method.
 */

#ifndef _FineTuneSupervisedMethod_H_
#define _FineTuneSupervisedMethod_H_


#include <string>
#include "FineTuneSupervisedMethod_hyperparameters.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Configuration for the supervised fine-tuning method.
 *
 *  \ingroup Models
 *
 */

class FineTuneSupervisedMethod : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuneSupervisedMethod();
	FineTuneSupervisedMethod(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuneSupervisedMethod();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FineTuneSupervisedMethod_hyperparameters getHyperparameters();

	/*! \brief Set 
	 */
	void setHyperparameters(FineTuneSupervisedMethod_hyperparameters  hyperparameters);

private:
	FineTuneSupervisedMethod_hyperparameters hyperparameters;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuneSupervisedMethod_H_ */
