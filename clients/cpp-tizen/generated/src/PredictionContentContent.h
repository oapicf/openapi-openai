/*
 * PredictionContent_content.h
 *
 * The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
 */

#ifndef _PredictionContent_content_H_
#define _PredictionContent_content_H_


#include <string>
#include "ChatCompletionRequestMessageContentPartText.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The content that should be matched when generating a model response. If generated tokens would match this content, the entire model response can be returned much more quickly. 
 *
 *  \ingroup Models
 *
 */

class PredictionContent_content : public Object {
public:
	/*! \brief Constructor.
	 */
	PredictionContent_content();
	PredictionContent_content(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PredictionContent_content();

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

#endif /* _PredictionContent_content_H_ */
