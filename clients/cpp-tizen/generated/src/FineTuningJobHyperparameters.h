/*
 * FineTuningJob_hyperparameters.h
 *
 * The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
 */

#ifndef _FineTuningJob_hyperparameters_H_
#define _FineTuningJob_hyperparameters_H_


#include <string>
#include "FineTuningJob_hyperparameters_n_epochs.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The hyperparameters used for the fine-tuning job. See the [fine-tuning guide](/docs/guides/fine-tuning) for more details.
 *
 *  \ingroup Models
 *
 */

class FineTuningJob_hyperparameters : public Object {
public:
	/*! \brief Constructor.
	 */
	FineTuningJob_hyperparameters();
	FineTuningJob_hyperparameters(char* str);

	/*! \brief Destructor.
	 */
	virtual ~FineTuningJob_hyperparameters();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	FineTuningJob_hyperparameters_n_epochs getNEpochs();

	/*! \brief Set 
	 */
	void setNEpochs(FineTuningJob_hyperparameters_n_epochs  n_epochs);

private:
	FineTuningJob_hyperparameters_n_epochs n_epochs;
	void __init();
	void __cleanup();

};
}
}

#endif /* _FineTuningJob_hyperparameters_H_ */
