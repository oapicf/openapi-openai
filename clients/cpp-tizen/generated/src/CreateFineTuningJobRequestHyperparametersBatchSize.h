/*
 * CreateFineTuningJobRequest_hyperparameters_batch_size.h
 *
 * Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
 */

#ifndef _CreateFineTuningJobRequest_hyperparameters_batch_size_H_
#define _CreateFineTuningJobRequest_hyperparameters_batch_size_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Number of examples in each batch. A larger batch size means that model parameters are updated less frequently, but with lower variance. 
 *
 *  \ingroup Models
 *
 */

class CreateFineTuningJobRequest_hyperparameters_batch_size : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateFineTuningJobRequest_hyperparameters_batch_size();
	CreateFineTuningJobRequest_hyperparameters_batch_size(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateFineTuningJobRequest_hyperparameters_batch_size();

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

#endif /* _CreateFineTuningJobRequest_hyperparameters_batch_size_H_ */
