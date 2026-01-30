/*
 * FineTuneDPOMethod_hyperparameters_n_epochs.h
 *
 * The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
 */

#ifndef _FineTuneDPOMethod_hyperparameters_n_epochs_H_
#define _FineTuneDPOMethod_hyperparameters_n_epochs_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The number of epochs to train the model for. An epoch refers to one full cycle through the training dataset. 
 *
 *  \ingroup Models
 *
 */

class FineTuneDPOMethod_hyperparameters_n_epochs : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuneDPOMethod_hyperparameters_n_epochs();
	FineTuneDPOMethod_hyperparameters_n_epochs(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuneDPOMethod_hyperparameters_n_epochs();

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

#endif /* _FineTuneDPOMethod_hyperparameters_n_epochs_H_ */
