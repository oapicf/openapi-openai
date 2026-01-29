/*
 * CreateFineTuningJobRequest_model.h
 *
 * The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned). 
 */

#ifndef _CreateFineTuningJobRequest_model_H_
#define _CreateFineTuningJobRequest_model_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The name of the model to fine-tune. You can select one of the [supported models](/docs/guides/fine-tuning/what-models-can-be-fine-tuned). 
 *
 *  \ingroup Models
 *
 */

class CreateFineTuningJobRequest_model : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateFineTuningJobRequest_model();
	CreateFineTuningJobRequest_model(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateFineTuningJobRequest_model();

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

#endif /* _CreateFineTuningJobRequest_model_H_ */
