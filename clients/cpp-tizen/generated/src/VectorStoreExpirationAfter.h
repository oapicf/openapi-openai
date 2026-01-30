/*
 * VectorStoreExpirationAfter.h
 *
 * The expiration policy for a vector store.
 */

#ifndef _VectorStoreExpirationAfter_H_
#define _VectorStoreExpirationAfter_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The expiration policy for a vector store.
 *
 *  \ingroup Models
 *
 */

class VectorStoreExpirationAfter : public Object {
public:
	/*! \brief Constructor.
	 */
	VectorStoreExpirationAfter();
	VectorStoreExpirationAfter(char* str);

	/*! \brief Destructor.
	 */
	virtual ~VectorStoreExpirationAfter();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
	 */
	std::string getAnchor();

	/*! \brief Set Anchor timestamp after which the expiration policy applies. Supported anchors: `last_active_at`.
	 */
	void setAnchor(std::string  anchor);
	/*! \brief Get The number of days after the anchor time that the vector store will expire.
	 */
	int getDays();

	/*! \brief Set The number of days after the anchor time that the vector store will expire.
	 */
	void setDays(int  days);

private:
	std::string anchor;
	int days;
	void __init();
	void __cleanup();

};
}
}

#endif /* _VectorStoreExpirationAfter_H_ */
