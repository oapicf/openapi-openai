/*
 * PredictionContent.h
 *
 * Static predicted output content, such as the content of a text file that is being regenerated. 
 */

#ifndef _PredictionContent_H_
#define _PredictionContent_H_


#include <string>
#include "PredictionContent_content.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Static predicted output content, such as the content of a text file that is being regenerated. 
 *
 *  \ingroup Models
 *
 */

class PredictionContent : public Object {
public:
	/*! \brief Constructor.
	 */
	PredictionContent();
	PredictionContent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PredictionContent();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The type of the predicted content you want to provide. This type is currently always `content`. 
	 */
	std::string getType();

	/*! \brief Set The type of the predicted content you want to provide. This type is currently always `content`. 
	 */
	void setType(std::string  type);
	/*! \brief Get 
	 */
	PredictionContent_content getContent();

	/*! \brief Set 
	 */
	void setContent(PredictionContent_content  content);

private:
	std::string type;
	PredictionContent_content content;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PredictionContent_H_ */
