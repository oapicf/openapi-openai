/*
 * CreateTranscriptionResponse.h
 *
 * 
 */

#ifndef _CreateTranscriptionResponse_H_
#define _CreateTranscriptionResponse_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class CreateTranscriptionResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateTranscriptionResponse();
	CreateTranscriptionResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateTranscriptionResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getText();

	/*! \brief Set 
	 */
	void setText(std::string  text);

private:
	std::string text;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateTranscriptionResponse_H_ */
