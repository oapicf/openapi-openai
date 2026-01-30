/*
 * AudioResponseFormat.h
 *
 * The format of the output, in one of these options: &#x60;json&#x60;, &#x60;text&#x60;, &#x60;srt&#x60;, &#x60;verbose_json&#x60;, or &#x60;vtt&#x60;. 
 */

#ifndef _AudioResponseFormat_H_
#define _AudioResponseFormat_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The format of the output, in one of these options: `json`, `text`, `srt`, `verbose_json`, or `vtt`. 
 *
 *  \ingroup Models
 *
 */

class AudioResponseFormat : public Object {
public:
	/*! \brief Constructor.
	 */
	AudioResponseFormat();
	AudioResponseFormat(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AudioResponseFormat();

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

#endif /* _AudioResponseFormat_H_ */
