/*
 * RealtimeSession_model.h
 *
 * The Realtime model used for this session. 
 */

#ifndef _RealtimeSession_model_H_
#define _RealtimeSession_model_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The Realtime model used for this session. 
 *
 *  \ingroup Models
 *
 */

class RealtimeSession_model : public Object {
public:
	/*! \brief Constructor.
	 */
	RealtimeSession_model();
	RealtimeSession_model(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RealtimeSession_model();

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

#endif /* _RealtimeSession_model_H_ */
