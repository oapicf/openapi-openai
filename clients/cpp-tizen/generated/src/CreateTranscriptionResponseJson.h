/*
 * CreateTranscriptionResponseJson.h
 *
 * Represents a transcription response returned by model, based on the provided input.
 */

#ifndef _CreateTranscriptionResponseJson_H_
#define _CreateTranscriptionResponseJson_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Represents a transcription response returned by model, based on the provided input.
 *
 *  \ingroup Models
 *
 */

class CreateTranscriptionResponseJson : public Object {
public:
	/*! \brief Constructor.
	 */
	CreateTranscriptionResponseJson();
	CreateTranscriptionResponseJson(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CreateTranscriptionResponseJson();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The transcribed text.
	 */
	std::string getText();

	/*! \brief Set The transcribed text.
	 */
	void setText(std::string  text);

private:
	std::string text;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CreateTranscriptionResponseJson_H_ */
