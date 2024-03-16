/*
 * CreateFineTuneRequest_model.h
 *
 * The name of the base model to fine-tune. You can select one of \&quot;ada\&quot;, \&quot;babbage\&quot;, \&quot;curie\&quot;, \&quot;davinci\&quot;, or a fine-tuned model created after 2022-04-21. To learn more about these models, see the [Models](https://platform.openai.com/docs/models) documentation. 
 */

#ifndef _CreateFineTuneRequest_model_H_
#define _CreateFineTuneRequest_model_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The name of the base model to fine-tune. You can select one of \"ada\", \"babbage\", \"curie\", \"davinci\", or a fine-tuned model created after 2022-04-21. To learn more about these models, see the [Models](https://platform.openai.com/docs/models) documentation. 
 *
 *  \ingroup Models
 *
 */

class CreateFineTuneRequest_model : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateFineTuneRequest_model();
	CreateFineTuneRequest_model(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateFineTuneRequest_model();

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

#endif /* _CreateFineTuneRequest_model_H_ */
