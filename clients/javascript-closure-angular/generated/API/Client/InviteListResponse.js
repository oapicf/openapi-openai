goog.provide('API.Client.InviteListResponse');

/**
 * @record
 */
API.Client.InviteListResponse = function() {}

/**
 * The object type, which is always `list`
 * @type {!string}
 * @export
 */
API.Client.InviteListResponse.prototype.object;

/**
 * @type {!Array<!API.Client.Invite>}
 * @export
 */
API.Client.InviteListResponse.prototype.data;

/**
 * The first `invite_id` in the retrieved `list`
 * @type {!string}
 * @export
 */
API.Client.InviteListResponse.prototype.firstId;

/**
 * The last `invite_id` in the retrieved `list`
 * @type {!string}
 * @export
 */
API.Client.InviteListResponse.prototype.lastId;

/**
 * The `has_more` property is used for pagination to indicate there are additional results.
 * @type {!boolean}
 * @export
 */
API.Client.InviteListResponse.prototype.hasMore;

/** @enum {string} */
API.Client.InviteListResponse.ObjectEnum = { 
  list: 'list',
}
